/*
public static boolean Check(String ccNumber)
    {
            int sum = 0;
            boolean alternate = false;
            for (int i = ccNumber.length() - 1; i >= 0; i--)
            {
                    int n = Integer.parseInt(ccNumber.substring(i, i + 1));
                    if (alternate)
                    {
                            n *= 2;
                            if (n > 9)
                            {
                                    n = (n % 10) + 1;
                            }
                    }
                    sum += n;
                    alternate = !alternate;
            }
            return (sum % 10 == 0);
    }
*/


/*

public static boolean luhn(String s) {
    IntUnaryOperator sumDigits = n -> n / 10 + n % 10;
    var digits = s.chars()
                  .map(Character::getNumericValue)
                  .toArray();
    return IntStream.rangeClosed(1, digits.length)
                    .map(i -> digits.length - i)
                    .map(i -> i % 2 == 0 ? digits[i] : sumDigits.applyAsInt(digits[i] * 2))
                    .sum() % 10 == 0;
}

*/
