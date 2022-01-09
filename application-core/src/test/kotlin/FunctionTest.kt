import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class FunctionTest : FunSpec({
    test("두 Int 값을 더하는 함수를 만들 수 있다.") {
        fun sumOf(x: Int): (Int) -> Int {
            return { y -> x + y }
        }

        val sumOf5 = sumOf(5)

        sumOf5(3) shouldBe 8
    }

    test("square 와 triple 을 합성해서 squareOfTriple 함수를 만들 수 있다.") {
        val square: T = { x -> x * x }
        val triple: T = { x -> x * 3 }

        val compose: (T) -> (T) -> T = { x -> { y -> { z -> x(y(z)) } } }
        val fn = compose(square)(triple)

        fn(3) shouldBe 81
    }
})

typealias T = (Int) -> Int
