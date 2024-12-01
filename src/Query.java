public class Query {
    String ip;
    String date;
    String method;
    String stateCode;
    String bytes;
    String way;
    String userAgent;

    public Query(String[] mas) {
        this.ip = mas[0];
        this.date = mas[1];
        this.method = mas[2];
        this.stateCode = mas[3].trim().split(" ")[0];
        this.bytes = mas[3].trim().split(" ")[1];
        this.way = mas[4];
        if (mas[6].contains("compatible;")) {
            this.userAgent = mas[6].split("compatible;")[1].trim().split("/")[0];
        }
        else this.userAgent= mas[6].trim();
    }
    public void getInfo(){
        System.out.println(ip + "\n" + date + "\n" + method + "\n" + stateCode + "\n" + bytes + "\n" + way + "\n" + userAgent);
    }


}