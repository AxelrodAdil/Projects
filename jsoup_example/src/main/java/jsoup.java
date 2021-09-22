import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;

/**
 * @Author Adil
 * @create 28.08.2021 23:07
 */
public class jsoup {
    public static void main(String[] args) {
        ArrayList<String> arrayList_date=new ArrayList<>();
        ArrayList<String> arrayList_usd=new ArrayList<>();
        try {
            arrayList_date=getData_date("19.08.2021", "28.08.2021");
            arrayList_usd=getData_USD("19.08.2021", "28.08.2021");
            for (int i=0;i<arrayList_date.size();i++){
                System.out.println(arrayList_date.get(i) + ": " + arrayList_usd.get(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<String> getData_date(String begin, String end) throws IOException {
        String url_national_bank = "https://nationalbank.kz/ru/exchangerates/ezhednevnye-oficialnye-rynochnye-kursy-valyut/report?rates%5B%5D=5&beginDate="+begin+"&endDate="+end;
        ArrayList<String> getByTable_date = new ArrayList<>();

        try {
            Document doc = Jsoup.connect(url_national_bank).get();
            Element table = doc.select("tbody").get(0);
            Elements rows = table.select("tr");

            for (Element row : rows) {
                Elements columns = row.select("td");
                getByTable_date.add(columns.get(0).text());
            }
        } catch (HttpStatusException exception) {
            exception.printStackTrace();
        }
        return getByTable_date;
    }

    public static ArrayList<String> getData_USD(String begin, String end) throws IOException {
        String url_national_bank = "https://nationalbank.kz/ru/exchangerates/ezhednevnye-oficialnye-rynochnye-kursy-valyut/report?rates%5B%5D=5&&beginDate="+begin+"&endDate="+end;
        ArrayList<String> getByTable_USD = new ArrayList<>();

        try {
            Document doc = Jsoup.connect(url_national_bank).get();
            Element table = doc.select("tbody").get(0);
            Elements rows = table.select("tr");

            for (Element row : rows) {
                Elements columns = row.select("td");
                getByTable_USD.add(columns.get(2).text());
            }
        } catch (HttpStatusException exception) {
            exception.printStackTrace();
        }
        return getByTable_USD;
    }
}