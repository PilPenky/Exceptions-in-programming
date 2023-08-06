package Lesson_1.Homework.Example2;

class Answer {
    public int[] subArrays(int[] a, int[] b) {

        int[] c = new int[a.length];

        if (a.length != b.length) {
            c = new int[]{0};
            return c;
        } else if (a.length == b.length){
            for (int i = 0; i < c.length; i++) {
                c[i] = a[i] - b[i];
            }
        }
        return c;
    }
}
