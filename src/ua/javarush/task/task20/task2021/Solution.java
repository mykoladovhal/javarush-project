package ua.javarush.task.task20.task2021;

import java.io.*;

/* 
Серіалізація під забороною
*/

public class Solution implements Serializable {
    public static class SubSolution extends Solution {

        public void writeObject(ObjectOutput out) throws NotSerializableException {
            throw new NotSerializableException();
        }
        public void readObject(ObjectInput in) throws NotSerializableException {
            throw new NotSerializableException();
        }
    }

    public static void main(String[] args) {

    }
}
