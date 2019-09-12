
package org.bonitasoft.web.designer.experimental.widgets;


public class PbTable {

    private String cssClasses;
    private Boolean hidden = false;
    private String headers = "";
    private String content;
    private String columnsKey;
    private String selectedRow;

    /**
     * 
     * @return
     *     The cssClasses
     */
    public String getCssClasses() {
        return cssClasses;
    }

    /**
     * 
     * @param cssClasses
     *     The cssClasses
     */
    public void setCssClasses(String cssClasses) {
        this.cssClasses = cssClasses;
    }

    /**
     * 
     * @return
     *     The hidden
     */
    public Boolean getHidden() {
        return hidden;
    }

    /**
     * 
     * @param hidden
     *     The hidden
     */
    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    /**
     * 
     * @return
     *     The headers
     */
    public String getHeaders() {
        return headers;
    }

    /**
     * 
     * @param headers
     *     The headers
     */
    public void setHeaders(String headers) {
        this.headers = headers;
    }

    /**
     * 
     * @return
     *     The content
     */
    public String getContent() {
        return content;
    }

    /**
     * 
     * @param content
     *     The content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 
     * @return
     *     The columnsKey
     */
    public String getColumnsKey() {
        return columnsKey;
    }

    /**
     * 
     * @param columnsKey
     *     The columnsKey
     */
    public void setColumnsKey(String columnsKey) {
        this.columnsKey = columnsKey;
    }

    /**
     * 
     * @return
     *     The selectedRow
     */
    public String getSelectedRow() {
        return selectedRow;
    }

    /**
     * 
     * @param selectedRow
     *     The selectedRow
     */
    public void setSelectedRow(String selectedRow) {
        this.selectedRow = selectedRow;
    }

}
