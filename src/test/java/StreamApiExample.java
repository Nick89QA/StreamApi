import io.restassured.http.ContentType;
import kukoinApi.TickerData;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static io.restassured.RestAssured.given;

public class StreamApiExample {

    /**
     * Метод который возвращает список из монет
     * @return
     */
    @Test
    public void checkAllCoins() {
        List<TickerData> tickers =  given()
                .contentType(ContentType.JSON)
                .when()
                .get("https://api.kucoin.com/api/v1/market/allTickers")
                .then()
                .log().body().statusCode(200)
                .extract().jsonPath().getList("data.ticker",TickerData.class);
    }

    /**
     * метод который возвращает лист монет
     */
     public List<TickerData> getAllCoins() {
         return given()
                 .contentType(ContentType.JSON)
                 .when()
                 .get("https://api.kucoin.com/api/v1/market/allTickers")
                 .then()
                 .log().body().statusCode(200)
                 .extract().jsonPath().getList("data.ticker",TickerData.class);

     }

    /**
     * метод который фильтрует нужные монеты
     */
//    @Test
//  public void checkUsdt(){
//      List<TickerData> getUsdt = getAllCoins().stream().filter()
//  }
}
