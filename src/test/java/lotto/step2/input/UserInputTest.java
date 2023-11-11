package lotto.step2.input;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class UserInputTest {
    @ParameterizedTest
    @ValueSource(ints = {1000, 3000, 9000, 15000})
    @DisplayName("구입금액을 입력받으면, 해당 구입금액을 가지고 있는 UserInput 객체가 생성된다.")
    void returnMatchingOperatorWhenSymbolIsMatched(final int userInput) {
        //given
        UserInput input = new UserInput(userInput);

        //when
        final int purchaseAmount = input.getPurchaseAmount();

        //then
        assertThat(purchaseAmount).isEqualTo(userInput);
    }

    @ParameterizedTest
    @ValueSource(ints = {0, -1000, -3000})
    @DisplayName("구입금액이 0원 이하면, IllegalArgumentException이 발생한다.")
    void throwIllegalArgumentExceptionWhenPurchaseAmountIsLessThanZeroAndEqualToZero(final int userInput) {
        //given, when, then
        assertThatThrownBy(() -> new UserInput(userInput))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("purchaseAmount must be greater than 0");
    }
}
