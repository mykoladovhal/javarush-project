package ua.javarush.task.task24.task2405;

/* 
Black box
*/

public class Solution implements Action {
    public static int countActionObjects;

    private int param;

    private Action solutionAction = new Action() {
        //напишіть тут ваш код

        FirstClass firstClass;
        SecondClass secondClass;

        public void someAction() {
            // ГЛАВНАЯ ЛОГИКА: если param > 0, начинается "эстафета" через getDependantAction()
            // если param <= 0, создаётся SecondClass для финального вывода

            if (param > 0) {
                // Создаём FirstClass только один раз (проверка на null)
                if (firstClass == null) {
                    // Анонимный FirstClass с переопределённым поведением
                    firstClass = new FirstClass() {

                        @Override
                        public void someAction() {
                            // 1. Печатаем "class FirstClass, method someAction"
                            super.someAction();
                            // 2. КЛЮЧ РЕКУРСИИ: передаём ход обратно Solution
                            // Solution.someAction() вызовет solutionAction.someAction() со СНИЖЕННЫМ param
                            Solution.this.someAction();
                        }

                        @Override
                        public Action getDependantAction() {
                            // 1. Печатаем текущее значение param (5, 4, 3, 2, 1...)
                            System.out.println(param);
                            // 2. Уменьшаем param ДО проверки
                            param--;
                            // 3. ЭСТАФЕТА: выбираем, кто будет следующим исполнять someAction():
                            //    - если param > 0 (ещё есть числа): вернуть Solution.this
                            //      -> Solution.someAction() -> solutionAction.someAction() в ветке if (param > 0)
                            //    - если param <= 0 (конец): вернуть this (FirstClass)
                            //      -> вызвать переопределённый FirstClass.someAction()
                            return (param > 0) ? Solution.this : this;
                        }
                    };
                }
                // СТАРТ ЭСТАФЕТЫ: вызываем getDependantAction(), который запускает цепочку рекурсивных вызовов
                firstClass.getDependantAction().someAction();
            } else {
                // ФИНАЛ: когда param <= 0, создаём SecondClass с финальным сообщением
                // Анонимный SecondClass с дополнительным выводом param
                secondClass = new SecondClass() {
                    @Override
                    public void someAction() {
                        // Придаём параметр к StringBuilder (он выводится поле "class SecondClass...")
                        sb.append(SPECIFIC_ACTION_FOR_ANONYMOUS_SECOND_CLASS_PARAM).append(param);
                        // Печатаем строки SecondClass и выставленные данные
                        super.someAction();
                    }
                };
                secondClass.someAction();
            }
        }
    };


    public Solution(int param) {
        this.param = param;
    }

    @Override
    public void someAction() {
        solutionAction.someAction();
    }

    /**
     * 5
     * 4
     * 3
     * 2
     * 1
     * class FirstClass, method someAction
     * class SecondClass, method someAction
     * Specific action for anonymous SecondClass, param = 0
     * Count of created Action objects is 2
     * class SecondClass, method someAction
     * Specific action for anonymous SecondClass, param = -1
     * Count of created Action objects is 3
     */
    public static void main(String[] args) {
        Solution solution = new Solution(5);
        solution.someAction();
        System.out.println("Count of created Action objects is " + countActionObjects);

        solution = new Solution(-1);
        solution.someAction();
        System.out.println("Count of created Action objects is " + countActionObjects);
    }
}
