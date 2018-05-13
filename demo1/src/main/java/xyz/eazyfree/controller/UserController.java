package xyz.eazyfree.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import xyz.eazyfree.domian.Result;
import xyz.eazyfree.domian.User;
import xyz.eazyfree.service.UserService;
import xyz.eazyfree.utils.ResultUtil;

import javax.validation.Valid;

/**
 * Created by ZhaoZhi qiang on 2018/4/9.
 */
@Controller
@RequestMapping(value = "/users")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;


    /**
     *  获取用户列表
     *    处理 "/users" 的 GET 请求，用来获取用户列表
     *    通过 @RequestParam 传递参数，进一步实现条件查询或者分页查询
     */
    @GetMapping(value = "")
    public String getUserList(ModelMap map) {
        map.addAttribute("userList", userService.findAll());
        return "user/list";
    }

    /**
     * 显示创建用户表单
     *
     * @param map
     * @return
     */
    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String createUserForm(ModelMap map) {
        map.addAttribute("user", new User());
        map.addAttribute("action", "create");
        return "user/form";
    }

    /**
     *  创建用户
     *    处理 "/users" 的 POST 请求，用来获取用户列表
     *    通过 @ModelAttribute 绑定参数，也通过 @RequestParam 从页面中传递参数
     */
/*    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String postUser(ModelMap map,
                           @ModelAttribute @Valid User user,
                           BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            log.info("【表单验证未通过】,{}",bindingResult.getFieldError().getDefaultMessage());
            map.addAttribute("action", "create");
            return "user/form";
        }

        userService.insertByUser(user);

        return "redirect:/users/";
    }*/
    @ResponseBody
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Result<User> postUser(ModelMap map,
                           @ModelAttribute @Valid User user,
                           BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            log.info("【表单验证未通过】,{}",bindingResult.getFieldError().getDefaultMessage());
            map.addAttribute("action", "create");

            return ResultUtil.error(1,bindingResult.getFieldError().getDefaultMessage());
        }

        User user1 = userService.insertByUser(user);

        return ResultUtil.success(user);
    }

    /**
     * 显示需要更新用户表单
     *    处理 "/users/{id}" 的 GET 请求，通过 URL 中的 id 值获取 User 信息
     *    URL 中的 id ，通过 @PathVariable 绑定参数
     */
    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public String getUser(@PathVariable Integer id, ModelMap map) {
        map.addAttribute("user", userService.findById(id));
        map.addAttribute("action", "update");
        return "user/form";
    }

    /**
     * 处理 "/users/{id}" 的 PUT 请求，用来更新 User 信息
     *
     */
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String putUser(ModelMap map,
                          @ModelAttribute @Valid User user,
                          BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            map.addAttribute("action", "update");
            return "user/form";
        }

        userService.update(user);
        return "redirect:/users/";
    }

    /**
     * 处理 "/users/{id}" 的 GET 请求，用来删除 User 信息
     */
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteUser(@PathVariable Integer id) {

        userService.delete(id);
        return "redirect:/users/";
    }

    @GetMapping(value = "/getAge/{id}")
    @ResponseBody
    public void getAge(@PathVariable("id") Integer id) throws Exception {
        System.out.println(id);
        userService.getAge(id);
    }
}
