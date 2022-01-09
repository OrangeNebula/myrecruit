import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class ComposeTest : FunSpec({

    test("덧셈 함수와 곱셈 합수를 파라미터로 받아서 합성할 수 있다.") {
        fun sumOf(a: Int, b: Int): Int {
            return a + b
        }

        fun multiplyOf(a: Int, b: Int): Int {
            return a * b
        }

        fun compose(
            f: (Int, Int) -> Int,
            g: (Int, Int) -> Int,
        ): (Int, Int, Int) -> Int = { x, y, z -> f(g(x, y), z) }

        val multiplyAndSum = compose(::sumOf, ::multiplyOf)

        val case1 = multiplyAndSum(3, 5, 2)

        case1 shouldBe 17
    }

    test("함수 파라미터를 이용하여 함수 합성을 할 수 있다.") {
        // fun<T> sumOf(a: T, b: T): T
    }

})
