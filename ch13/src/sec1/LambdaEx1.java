package sec1;

public class LambdaEx1 {
    public int method1(int x, int y) {      // 정의했으면 나중에 호출해줘야 함
        return x * y;
    }

    /*
    1. 람다식 구현체 (호출X)
        (x, y) -> { x * y };
    
    2. 람다식 종류
        () -> { }           : Basic (취급안함)
        (x) -> { }          : Consumer
        () -> { x }         : Supplier
        (x) -> { x * x }
            : Operator  (주로 매개변수를 전달받아 처리를 한 후 다시 반환하는 타입)
            : Function  (주로 매개변수를 받아 처리한 후 그 결과를 형변환하여 반환하는 타입)
            : Predicate (주로 매개변수를 받아 비교한 후 일치하는지 여부를 논리값으로 반환하는 타입)
     */

}
