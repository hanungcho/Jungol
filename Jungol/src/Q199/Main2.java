package Q199;

import java.util.Scanner;

class Person2 {
    private String name;
    private int[] score;
    private int sum;

    Person2(String name, int[] score, int sum) {
        this.name = name;
        this.score = score;
        this.sum = sum;
    }

    public String getName() {
        return name;
    }

    public int[] getScore() {
        return score;
    }

    public int getSum() {
        return sum;
    }
}

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 객체배열 생성
        Person2[] person2 = new Person2[n];
        for (int i = 0; i < n; i++) {
            int[] score = new int[3];
            int sum = 0;
            String name = sc.next();
            for (int j = 0; j < score.length; j++) {
                score[j] = sc.nextInt();
                sum += score[j];
            }
            person2[i] = new Person2(name, score, sum);
        }
        sc.close();
        
        // 생성된 객체배열 정렬(내림차순)
        new Main().sort(person2);

        // 객체배열 출력
        for (int i = 0; i < person2.length; i++) {
            System.out.print(person2[i].getName() + " ");
            for (int j = 0; j < person2[i].getScore().length; j++) {
                System.out.print(person2[i].getScore()[j] + " ");
            }
            System.out.println(person2[i].getSum());
        }
    }

    public void sort(Person2 person2[]) {
        Arrays.sort(person2, Comparator.comparingInt(Person2::getSum).reversed());
    }
}