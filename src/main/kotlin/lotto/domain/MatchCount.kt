package lotto.domain

import lotto.exception.MatchCountException
import lotto.exception.MoneyException

class MatchCount(var count: Int) {
    companion object {
        private const val UNIT_SUFFIX = "개"
    }

    init {
        require(count >= 0) { MatchCountException.NOT_POSITIVE_NUMBER.message }
    }

    override fun toString(): String = "%d$UNIT_SUFFIX".format(count)
}