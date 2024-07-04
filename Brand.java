public enum Brand {
    SAMSUNG("삼성"),
    APPLE("애플");

    private String kor;

    Brand(String kor) {
        this.kor = kor;
    }

    public String getKor(){
        return kor;
    }
}
