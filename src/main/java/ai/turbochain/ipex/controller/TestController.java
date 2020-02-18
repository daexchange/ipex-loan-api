package ai.turbochain.ipex.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ai.turbochain.ipex.bean.MemberWallet;
import ai.turbochain.ipex.dao.MemberWalletMapper;
import ai.turbochain.ipex.util.MessageResult;
import lombok.extern.slf4j.Slf4j;


/**
 * @author 
 * @date 
 */
@RestController
@RequestMapping("/test")
@Slf4j
public class TestController extends BaseController {

    @Autowired
    private MemberWalletMapper memberWalletMapper;
    
    @RequestMapping(value = "test")
    public MessageResult test() {
    	List<MemberWallet> list = memberWalletMapper.selectAllUserWallet();
    	
    	return success(list);
    }
}
