/**
 * 
 */
package cn.e3mall.common.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * @author Edward-jhl
 *
 */
public class EasyUIDataGridResult implements Serializable{

	public EasyUIDataGridResult() {
		super();
		// TODO Auto-generated constructor stub
	}

	private Long total;

	private List<?> rows;

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public List<?> getRows() {
		return rows;
	}

	public void setRows(List<?> rows) {
		this.rows = rows;
	}
	
	

	
}
