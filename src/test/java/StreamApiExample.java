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
    public List<TickerData> getTickers() {
        return given()
                .contentType(ContentType.JSON)
                .when()
                .get("https://api.kucoin.com/api/v1/market/allTickers")
                .then()
                .log().body()
                .extract().jsonPath().getList("data.ticker",TickerData.class);

    }

    /**
     * метод который фильтрует из массива конкретную монету
     */
    @Test
    public void checkCrypto() {
        List<TickerData> usdtTickers = getTickers().stream().filter(x->x.getSymbol().endsWith("BTC")).collect(Collectors.toList());
        int a = 0;
    }

}
