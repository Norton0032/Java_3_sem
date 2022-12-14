package _5;

public class PhoneNumber {
    int countryCode;
    int operatorCode;
    int numberFirstThreeDigits;
    int numberLastFourDigits;

    public PhoneNumber(int countryCode, int operatorCode, int numberFirstThreeDigits, int numberLastFourDigits) {
        this.countryCode = countryCode;
        this.operatorCode = operatorCode;
        this.numberFirstThreeDigits = numberFirstThreeDigits;
        this.numberLastFourDigits = numberLastFourDigits;
    }

    public PhoneNumber(String phoneNumberString) {
        char firstChar = phoneNumberString.charAt(0);
        if (firstChar == '+' && (phoneNumberString.length()==12 || phoneNumberString.length()==13)|| firstChar == '8' && phoneNumberString.length()==11 ) {
            if (firstChar == '+') {
                phoneNumberString = phoneNumberString.substring(1);
                countryCode = Integer.parseInt(phoneNumberString.substring(0, 1));
            } else {
                countryCode = 7;
            }
            operatorCode = Integer.parseInt(phoneNumberString.substring(1, 4));
            numberFirstThreeDigits = Integer.parseInt(phoneNumberString.substring(4, 7));
            numberLastFourDigits = Integer.parseInt(phoneNumberString.substring(7, 11));
        } else {
            System.out.println("Неправильный ввод");
        }
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "+" + countryCode +
                operatorCode +
                "-" + numberFirstThreeDigits +
                "-" + numberLastFourDigits +
                '}';
    }
}
