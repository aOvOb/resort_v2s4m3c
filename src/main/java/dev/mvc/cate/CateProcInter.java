package dev.mvc.cate;

import java.util.List;

public interface CateProcInter {
  /**
   * 등록
   * @param cateVO
   * @return 등록된 갯수
   */
  public int create(CateVO cateVO);
  
  /**
   * 목록
   * 
   * @return 레코드 목록
   */
  public List<CateVO> list_cateno_asc();
  
  /**
   * 목록 - 출력순서 정렬
   * @return 
   */
  public List<CateVO> list_seqno_asc();
  
  /**
   * 카테고리 그룹별 목록
   * @param categrpno 카테고리 그룹 번호
   * @return
   */
  public List<CateVO> list_by_categrpno(int categrpno);
  
  /**
   * 조회
   * 
   * @param cateno
   * @return
   */
  public CateVO read(int cateno);

  /**
   * 수정 처리
   * 
   * @param cateVO
   * @return 
   */
  public int update(CateVO cateVO);
  
  /**
   * 삭제 처리 
   * 
   * @param cateno
   * @return 
   */
  public int delete(int cateno);
  
  /**
   * 출력 순서 상향
   * @param cateno
   * @return
   */
  public int update_seqno_up(int cateno);
 
  /**
   * 출력 순서 하향
   * @param cateno
   * @return
   */
  public int update_seqno_down(int cateno);
  
  /**
   * visible 수정
   * @param cateVO
   * @return 
   */
  public int update_visible(CateVO cateVO);
  
  /**
   *  통합 VO 기반 join
   * @return
   */
  public List<Categrp_Cate_join> list_join();  
  
  /**
   *  통합 VO 기반 join
   * @return
   */
  public List<Categrp_Cate_join> list_join_by_categrpno(int categrpno);  
  
  /**
   * 글 수 증가
   * <update id="increaseCnt" parameterType="int">
   * @return
   */
  public int increaseCnt(int cateno);    

  /**
   * 글 수 감소
   * <update id="decreaseCnt" parameterType="int">
   * @return
   */
  public int decreaseCnt(int cateno);
  
}
