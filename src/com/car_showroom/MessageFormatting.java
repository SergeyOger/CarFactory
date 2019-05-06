package com.car_showroom;

public final class MessageFormatting {

    public enum InfoMassage {
        WRONG_INPUT("Wrong input,please repeat the input");
        private String massage;

        InfoMassage(String massage) {
            this.massage = massage;
        }

        public String getMassage() {
            return massage;
        }
    }


}
