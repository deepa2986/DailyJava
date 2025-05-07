package switchdemo;

public class SwitchDemo {

    enum Season{
        SPRING,MONSOON,WINTER,SUMMER
    }

    public static void main(String[] args) {
        //old switch
        int stage1 = 0;
        String season;
        switch (stage1) {
            case 0:
                season = "summer";
                break;
            case 1:
                season = "spring";
                break;
            case 2:
                season = "monsoon";
                break;
            default:
                season = "Invalid stage";
        }
        System.out.println(season);


        //java 12 switch
        int stage2 = 11;
        String season1 = switch (stage2) {
            case 0 -> "spring";
            case 1 -> "monsoon";
            case 2 -> "summer";
            case 3 -> "winter";
            //default -> "Invalid stage";
            default -> {
                System.out.println("This is invalid season");
                yield "Invalid stage";
            }
        };
        System.out.println(season1);

        Season season2 = Season.SUMMER;

        String weather = switch (season2){
            case SPRING -> "spring";
            case WINTER -> "snowy";
            case SUMMER -> "summer";
            case MONSOON -> "monsoon";
            default -> {
                System.out.println("Invalid season");
                yield "Invalid weather";
            }
        };
        System.out.println(weather);
    }

}
