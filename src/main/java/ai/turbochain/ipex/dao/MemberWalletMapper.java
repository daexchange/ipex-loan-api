package ai.turbochain.ipex.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ai.turbochain.ipex.bean.MemberWallet;

/**
 * 用户钱包数据库操作
 * 
 * @author
 *
 */
@Mapper
public interface MemberWalletMapper {
	/**
	 * 返回用户钱包表所有记录
	 * 
	 * @return
	 */
	List<MemberWallet> selectAllUserWallet();
}