package com.java.assignment1;

import java.util.Scanner;

public class GradeAverage {

	public static void main(String[] args) {

		Scanner collectGrade = new Scanner(System.in);

		System.out.print("How many subjects do you have? ");

		int totalSubjects = collectGrade.nextInt();

		int[] subjectScores = new int[totalSubjects];

		double sum = 0;

		for (int i = 0; i < subjectScores.length; i++) {

			System.out.print("Enter the score for Subject " + ": ");

			subjectScores[i] = collectGrade.nextInt();

			sum = sum + subjectScores[i];
		}

		double averageGrade = (sum / totalSubjects);

		System.out.print("Average grade: " + averageGrade);
	}

}
