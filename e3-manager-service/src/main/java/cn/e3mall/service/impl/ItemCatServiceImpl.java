/**
 * 
 */
package cn.e3mall.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.e3mall.mapper.TbItemCatMapper;
import cn.e3mall.pojo.EasyUITreeNode;
import cn.e3mall.pojo.TbItemCat;
import cn.e3mall.pojo.TbItemCatExample;
import cn.e3mall.service.ItemCatService;

/**
 * @author Edward-jhl
 *
 */
@Service
public class ItemCatServiceImpl implements ItemCatService {

	@Autowired
	private TbItemCatMapper itemCatMapper;

	@Override
	public List<EasyUITreeNode> getItemCatList(Long parentId) {
		// 查询节点列表
		TbItemCatExample example = new TbItemCatExample();
		example.createCriteria().andParentIdEqualTo(parentId);
		List<TbItemCat> list = itemCatMapper.selectByExample(example);
		// 將查询到的数据转化为EasyUITreeNode
		List<EasyUITreeNode> resultList = new ArrayList<>();
		// 循环将查询到的数据进行转换
		for (TbItemCat tbItemCat : list) {
			EasyUITreeNode TreeNode = new EasyUITreeNode();
			TreeNode.setId(tbItemCat.getId());
			TreeNode.setText(tbItemCat.getName());
			// 这个state表示时候有二级节点，取值有closed|open
			TreeNode.setState(tbItemCat.getIsParent() ? "closed" : "open");
			// treeNode的数据添加到准备好的treeNode;
			resultList.add(TreeNode);
		}
		// 3.返回
		return resultList;
	}

}
