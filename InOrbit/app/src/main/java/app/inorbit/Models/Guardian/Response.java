
package app.inorbit.Models.Guardian;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Response {

    @SerializedName("currentPage")
    @Expose
    private Integer currentPage;
    @SerializedName("pageSize")
    @Expose
    private Integer pageSize;
    @SerializedName("pages")
    @Expose
    private Integer pages;
    @SerializedName("total")
    @Expose
    private Integer total;
    @SerializedName("userTier")
    @Expose
    private String userTier;
    @SerializedName("startIndex")
    @Expose
    private Integer startIndex;
    @SerializedName("results")
    @Expose
    private List<Result> results = new ArrayList<Result>();
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("orderBy")
    @Expose
    private String orderBy;

    /**
     * 
     * @return
     *     The currentPage
     */
    public Integer getCurrentPage() {
        return currentPage;
    }

    /**
     * 
     * @param currentPage
     *     The currentPage
     */
    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    /**
     * 
     * @return
     *     The pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * 
     * @param pageSize
     *     The pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * 
     * @return
     *     The pages
     */
    public Integer getPages() {
        return pages;
    }

    /**
     * 
     * @param pages
     *     The pages
     */
    public void setPages(Integer pages) {
        this.pages = pages;
    }

    /**
     * 
     * @return
     *     The total
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * 
     * @param total
     *     The total
     */
    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
     * 
     * @return
     *     The userTier
     */
    public String getUserTier() {
        return userTier;
    }

    /**
     * 
     * @param userTier
     *     The userTier
     */
    public void setUserTier(String userTier) {
        this.userTier = userTier;
    }

    /**
     * 
     * @return
     *     The startIndex
     */
    public Integer getStartIndex() {
        return startIndex;
    }

    /**
     * 
     * @param startIndex
     *     The startIndex
     */
    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

    /**
     * 
     * @return
     *     The results
     */
    public List<Result> getResults() {
        return results;
    }

    /**
     * 
     * @param results
     *     The results
     */
    public void setResults(List<Result> results) {
        this.results = results;
    }

    /**
     * 
     * @return
     *     The status
     */
    public String getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 
     * @return
     *     The orderBy
     */
    public String getOrderBy() {
        return orderBy;
    }

    /**
     * 
     * @param orderBy
     *     The orderBy
     */
    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

}
