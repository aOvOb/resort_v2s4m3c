package dev.mvc.contents;

import java.util.HashMap;
import java.util.List;

public interface ContentsDAOInter {
  /**
   * ���
   * @param contentsVO
   * @return ��ϵ� ����
   */
  public int create(ContentsVO contentsVO);
  
  /**
   * ��� ī�װ����� ��ϵ� �� ���
   * @return
   */
  public List<ContentsVO> list_all();
  
  /**
   * Ư�� ī�װ����� ��ϵ� �� ���
   * @return
   */
  public List<ContentsVO> list_by_cateno(int cateno);
  
  /**
   * ��ȸ
   * @param contentsno
   * @return
   */
  public ContentsVO read(int contentsno);
  
  /**
   * ���� ó��
   * @param contentsVO
   * @return
   */
  public int update(ContentsVO contentsVO);
  
  /**
   * �н����� �˻�
   * @param hashMap
   * @return
   */
  public int passwd_check(HashMap hashMap);
  
  /**
   * ����
   * @param contentsno
   * @return
   */
  public int delete(int contentsno);
  
  /**
   * ÷�� ���� ����
   * @param contentsVO
   * @return
   */
  public int update_img(ContentsVO contentsVO);
  
  /**
   * ��� ���ڵ� ����
   * @return
   */
  public int total_count();
  
}