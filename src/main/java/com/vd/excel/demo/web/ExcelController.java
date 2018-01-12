/**
 * 文 件 名:  ExcelController
 * 版    权:  Quanten Teams. Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  Vincent Deng
 * 修改时间:  2018/1/13
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.vd.excel.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <一句话功能简述> <功能详细描述>
 *
 * @author Vincent Deng
 * @version 2018/1/13
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
@RestController
public class ExcelController {

    @RequestMapping("/hello")
    public String  helloWord() {
        String word = "I am a King!";
        System.out.println(word);
        return  word;
    }
}