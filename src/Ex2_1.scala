object Ex2_1 {
    def main(args: Array[String]): Unit = {
        var a = "변수입니다"
        val b = "상수입니다"

        a = "바꿀 수 있을까요~~?"
//        b = "바꿀 수 있을까~?"

        println(a)
        println(b)

//        var c   // 에러 선언과 동시에 초기화가 필요

        var d = null;   // 권장사항 x
        var e = None;    // 권상사항 o

        var f: Int = 10     // 자료형을 명시 -> 정수형만 가능 (Java)
//        f = 10.5          // 에러 발생


    }
}
