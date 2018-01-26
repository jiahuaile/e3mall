/**
 * 
 */
package cn.e3mall.service;

import java.util.List;

import cn.e3mall.pojo.EasyUITreeNode;

/**
 * @author Edward-jhl
 *
 */
public interface ItemCatService {
	
	List<EasyUITreeNode> getItemCatList(Long parentId);

}
