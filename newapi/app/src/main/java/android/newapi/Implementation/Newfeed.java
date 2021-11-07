package android.newapi.Implementation;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Newfeed {

    @SerializedName("status")
    @Expose
    private  String status;
    @SerializedName("totalResults")
    @Expose
    private  String totalResults;
    @SerializedName("articles")
    @Expose
    private List<Articles> articles;

    public Newfeed(String status, String totalResults, List<Articles> articles) {
        this.status = status;
        this.totalResults = totalResults;
        this.articles = articles;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(String totalResults) {
        this.totalResults = totalResults;
    }

    public List<Articles> getArticles() {
        return articles;
    }

    public void setArticles(List<Articles> articles) {
        this.articles = articles;
    }

}
