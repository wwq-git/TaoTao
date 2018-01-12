package com.taotao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.pojo.TbItem;
import com.taotao.service.ItemService;

@Controller
public class ItemController {

	@Autowired
	private ItemService itemService;

	// 3.写方法
	@RequestMapping("/item/{itemId}")
	@ResponseBody
	public TbItem geTbItem(@PathVariable long itemId) {
		// 调用service中的方法
		TbItem tbItem = itemService.getItemById(itemId);
		return tbItem;
	}

}
