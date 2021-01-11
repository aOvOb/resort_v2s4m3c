package dev.mvc.cate;

import java.util.List;

public interface CateProcInter {
  /**
   * ���
   * @param cateVO
   * @return ��ϵ� ����
   */
  public int create(CateVO cateVO);
  
  /**
   * ���
   * 
   * @return ���ڵ� ���
   */
  public List<CateVO> list_cateno_asc();
  
  /**
   * ��� - ��¼��� ����
   * @return 
   */
  public List<CateVO> list_seqno_asc();
  
  /**
   * ī�װ� �׷캰 ���
   * @param categrpno ī�װ� �׷� ��ȣ
   * @return
   */
  public List<CateVO> list_by_categrpno(int categrpno);
  
  /**
   * ��ȸ
   * 
   * @param cateno
   * @return
   */
  public CateVO read(int cateno);

  /**
   * ���� ó��
   * 
   * @param cateVO
   * @return 
   */
  public int update(CateVO cateVO);
  
  /**
   * ���� ó�� 
   * 
   * @param cateno
   * @return 
   */
  public int delete(int cateno);
  
  /**
   * ��� ���� ����
   * @param cateno
   * @return
   */
  public int update_seqno_up(int cateno);
 
  /**
   * ��� ���� ����
   * @param cateno
   * @return
   */
  public int update_seqno_down(int cateno);
  
  /**
   * visible ����
   * @param cateVO
   * @return 
   */
  public int update_visible(CateVO cateVO);
  
  /**
   *  ���� VO ��� join
   * @return
   */
  public List<Categrp_Cate_join> list_join();  
  
  /**
   *  ���� VO ��� join
   * @return
   */
  public List<Categrp_Cate_join> list_join_by_categrpno(int categrpno);  
  
  /**
   * �� �� ����
   * <update id="increaseCnt" parameterType="int">
   * @return
   */
  public int increaseCnt(int cateno);    

  /**
   * �� �� ����
   * <update id="decreaseCnt" parameterType="int">
   * @return
   */
  public int decreaseCnt(int cateno);
  
}
