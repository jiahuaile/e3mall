/**
 * 
 */
package cn.e3mall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Edward-jhl
 *
 */
@Controller
public class PageController {

	//访问所有路径时，默认就是index页面
	@RequestMapping("/")
	public String showIndex(){
		return "index";
	}
	//路径中包含page参数的请求，都进行页面展示
	@RequestMapping("/{page}")
	public String showPage(@PathVariable String page){
		return page;
	}
}
