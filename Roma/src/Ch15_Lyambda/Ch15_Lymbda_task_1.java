package Ch15_Lyambda;

public class Ch15_Lymbda_task_1 {
    public static void main(String[] args) {
        MathOperation sumOperation=(a,b)->a+b;
        MathOperation substractOperation=(a,b)->a-b;
        MathOperation multipleOperation=(a,b)->a*b;
        MathOperation divisionOperation=(a,b)->a/b;

        System.out.println(sumOperation.operate(10,20));
        System.out.println(substractOperation.operate(10,20));
        System.out.println(multipleOperation.operate(10,20));
        System.out.println(divisionOperation.operate(10,20));
    }
}
