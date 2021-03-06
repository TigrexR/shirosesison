package cloud.gateway.service;

import cloud.gateway.service.Base.BaseService;
import cloud.gateway.core.models.SysDict;
import cloud.gateway.core.pagination.Page;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/11/10.
 */
public interface SysDictService extends BaseService<SysDict> {
    /**
     * 根据id查询所有子节点，不包含自己
     * @param
     * @return
     */
    List<SysDict> getLinkageById(String id)throws Exception;
    /**
     * 根据id 查询子节点，包含自己
     * @param
     * @return
     */
    List<SysDict> getLinkage(String id)throws Exception;

    /**
     * 根据字典类别查询
     * @param zdlb
     * @return
     */
    SysDict findByZdlb(String zdlb);
    /**
     *  查询全部
     * @return
     */
    List<SysDict> findAll();
    /**
     * 统计全部数量
     * @param
     * @return
     */
    Integer getCount();
    /**
     * 根据sql分页条件返回查询结果
     * @param obj
     * @param page
     * @return
     * @throws Exception
     */
    Page<SysDict> getPageBySql(SysDict obj, Page<SysDict> page, String orderBySql)throws Exception;

    /**
     * 根据主键删除
     * @param id
     * @return
     */
    boolean deleteById(String id);
    /**
     * 统计数量
     * @param pid
     * @return
     */
    Integer getCountById(String pid);
    /**
     * 根据pid查询单条数据
     * @param pid
     * @return
     */
    List<SysDict> getBeanByPid(String pid);
    /**
     * 根据id查询下一级所有菜单
     * @param id
     * @return
     */
    List<SysDict> getByNote(String id);
    /**
     * 根据id查询下一级所有菜单的数量
     * @param id
     * @return
     */
    Integer countByNote(String id);
    /**
     * 根据id查询所有父节点
     * @param id
     * @return
     */
    List<SysDict> findUpByid(String id);

    public List<SysDict> getDictByPid(String pid);


    void importExecl(List<SysDict> list, Map map) throws Exception;

}
