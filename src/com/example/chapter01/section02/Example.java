package com.example.chapter01.section02;

class Example {

    interface OnClickListener {
        void onClick();
    }


    private OnClickListener onClickListener;

    public void onClick() {
        if (onClickListener != null) {
            onClickListener.onClick();
        }

    }

    static class Utils {

        static boolean isAdult(User user) {
            return user.getAge() > 18;
        }
    }

    public static void main(String[] args) {
        User user = new User("Jack", 19);
        boolean isAudlt = Utils.isAdult(user);
    }

}
