import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        int m1, n1, a1, b1;
        int m2, n2, a2, b2;

        Scanner scanner = new Scanner(System.in);

do{
        System.out.println("NHAN HAI MA TRAN:");
        System.out.println("nhap so dong cua matrix A: ");
        m1 = scanner.nextInt();
        System.out.println("Nhap so cot cua matrix A: ");
        n1 = scanner.nextInt();

        System.out.println("Nhap vao so dong cua matrix B: ");
        m2 = scanner.nextInt();
        System.out.println("Nhap vao so cot cua matrix B: ");
        n2 = scanner.nextInt();

        int[][] A = new int[m1][n1];
        int[][] B = new int[m2][n2];
        int C[][] = new int[m1][n2];
        

            System.out.println("nhap vao phan tu cua matrix A: ");
            for (int i = 0; i < m1; i++) {
                for (int j = 0; j < n1; j++) {
                    System.out.print("A[" + i + "][" + j + "] = ");
                    A[i][j] = scanner.nextInt();
                }
            }

            // nhập giá trị của các phần tử cho 2 ma trận B
            System.out.println("nhap vao gia tri cua matrix B: ");
            for (int i = 0; i < m2; i++) {
                for (int j = 0; j < n2; j++) {
                    System.out.print("B[" + i + "][" + j + "] = ");
                    B[i][j] = scanner.nextInt();
                }
            }

            // hiển thị 2 ma trận vừa nhập
            System.out.println("Matrix A: ");
            for (int i = 0; i < m1; i++) {
                for (int j = 0; j < n1; j++) {
                    System.out.print(A[i][j] + "\t");
                }
                System.out.println("\n");
            }

            System.out.println("Matrix B: ");
            for (int i = 0; i < m2; i++) {
                for (int j = 0; j < n2; j++) {
                    System.out.print(B[i][j] + "\t");
                }
                System.out.println("\n");
            }

            // tính và in ra ma trận C = A * B
            for (int i = 0; i < m1; i++) {
                for (int j = 0; j < n2; j++) {
                    C[i][j] = 0;
                    for (int k = 0; k < n1; k++) {
                        C[i][j] = C[i][j] + A[i][k] * B[k][j];
                    }
                }
            }

            // hiển thị ma trận tích C
            System.out.println("Matrix C = A * B: ");
            for (int i = 0; i < m1; i++) {
                for (int j = 0; j < n2; j++) {
                    System.out.print(C[i][j] + "\t");
                }
                System.out.println("\n");
            }
        }while( m1 != n2);
        

        System.out.println("CONG HAI MA TRAN:");
        System.out.println("nhap so dong cua matrix D: ");
        a1 = scanner.nextInt();
        System.out.println("Nhap so cot cua matrix D: ");
        b1 = scanner.nextInt();

        System.out.println("Nhap vao so dong cua matrix E: ");
        a2 = scanner.nextInt();
        System.out.println("Nhap vao so cot cua matrix E: ");
        b2 = scanner.nextInt();
        int[][] D = new int[a1][b1];
        int[][] E = new int[a2][b2];
        int F[][] = new int[a1][b1];

        if (a1 != a2 || b1 != b2) {
            System.out.println("so hang va so cot cua hai ma tran phai bang nhau");
            System.out.println("nhap so hang cua matrix D: ");
            a1 = scanner.nextInt();
            System.out.println("nhap so cot cua matrix D: ");
            b1 = scanner.nextInt();
            System.out.println("Nhap vao so hang cua matrix E: ");
            a2 = scanner.nextInt();
            System.out.println("nhap so cot cua matrix E: ");
            b2 = scanner.nextInt();
        } else {
            System.out.println("nhap vao phan tu cua matrix D: ");
            for (int i = 0; i < a1; i++) {
                for (int j = 0; j < b1; j++) {
                    System.out.print("D[" + i + "][" + j + "] = ");
                    D[i][j] = scanner.nextInt();
                }
            }

            // nhập giá trị của các phần tử cho 2 ma trận B
            System.out.println("nhap vao gia tri cua matrix F: ");
            for (int i = 0; i < a2; i++) {
                for (int j = 0; j < b2; j++) {
                    System.out.print("E[" + i + "][" + j + "] = ");
                    E[i][j] = scanner.nextInt();
                }
            }
            // tính và in ra ma trận F=D+E
            for (int i = 0; i < a1; i++) {
                for (int j = 0; j < b1; j++) {
                    F[i][j] = 0;
                    F[i][j] = D[i][j] + E[i][j];

                }
            }
            System.out.println("Matrix F = A + B: ");
            for (int i = 0; i < a1; i++) {
                for (int j = 0; j < b1; j++) {
                    System.out.print(F[i][j] + "\t");
                }
                System.out.println("\n");
            }

        }

    }
}