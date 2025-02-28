<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>


<style>

.orderHidden {
	display: none;
}

</style>

<section class="cat_product_area section_padding">
        <div class="container">
            <div class="row">
                <div class="col-lg-3">
                
                    <div class="left_sidebar_area">
                        <aside class="left_widgets p_filter_widgets">
                            <div class="l_w_title">
                                <h4>주문내역</h4>
                                <br>
                            </div>
                            <div class="widgets_inner">
                                <ul class="list">
                                    <li><a href="myOrderList.do">주문/배송목록</a></li>
                                    <li><a href="#">반품/교환내역</a></li>
                                </ul>
                            </div>
                        </aside>

                        <aside class="left_widgets p_filter_widgets">
                            <div class="l_w_title">
                                <h4>회원정보</h4>
                                <br>
                            </div>
                            <div class="widgets_inner">
                                <ul class="list">
                                    <li><a href="#">개인정보 수정</a></li>
                                    <li><a href="#">마이리뷰</a></li>
                                    <li><a href="#">회원탈퇴</a></li>
                                </ul>
                            </div>
                        </aside>
                        
                         <aside class="left_widgets p_filter_widgets">
                            <div class="l_w_title">
                                <h4>고객센터</h4>
                                <br>
                            </div>
                            <div class="widgets_inner">
                                <ul class="list">
                                    <li><a href="#">1:1문의내역</a></li>
                                </ul>
                            </div>
                        </aside>
                    </div>
                    
                </div>
                <!-- 바뀌는 구역 -->
        
                <div class="col-lg-9">
                   <div class="row align-items-center latest_product_inner productlist" style="width: 720px; height: 640px;">
                     <table class="table addOrderList">
                       <c:forEach var="vo" items="${orderList}">
                      <thead>
                       <tr>
                         <th>주문날짜</th>
                         <th>주문번호</th>
                         <th>주문상품</th>
                         <th>주문상태</th>
                         <th>상세조회</th>
                       </tr>
                     </thead>
                     <tbody>  
                       <tr>
                        <td><fmt:formatDate value="${vo.orderDate }" pattern="yyyy-MM-dd"></fmt:formatDate></td>
                        <td>${vo.orderNo }</td>
                        <td> ${vo.proName }</td>
                        <td>${vo.deliveryStatus }</td>
                        <td><button onclick="detailView()">상세조회</button></td> <!-- 확인하기 -->
                       </tr>
                       
                       <tr class="orderHidden">
                       <td colspan="5">
                       <table>
                        <tr>
                        <td>상품이미지</td>
                        <td>상품명</td>
                        <td>가격</td>
                        <td colspan="2">수량</td>
                       </tr>
                       <tr>
                       	 <td><c:if test="${!empty vo.proImage}"><img width="150px" src="img/${vo.proImage}"></c:if></td>
                       	 <td> ${vo.proName }</td>
                       	 <td>${vo.totalPrice }원</td>
                       	 <td colspan="2">${vo.deProCnt }개</td>
                       </tr>
                       <tr>
                        <td colspan="2">수령인</td>
                        <td colspan="2">연락처</td>
                        <td colspan="2">주소</td>
                       </tr>
                       <tr>
                        <td colspan="2">${vo.orderRecipient }</td>
                        <td colspan="2">${vo.orderPhone }</td>
                        <td colspan="2">${vo.orderAddr }${vo.detailAddr }</td>
                        <td></td>                       
                       </tr> 
                       <tr>
                        <td colspan="5" style="text-align:center">총 주문금액</td>
                       </tr>
                       <tr>
                        <td colspan="5"  style="text-align:center">${vo.totalPrice }원</td>
                       </tr>
                       </table>
                       </td>
                       </tr>
                     </tbody>   
                      
                      
                       </c:forEach> 
                     </table>  
                   </div>          
              </div>
               <!-- 바뀌는 구역 끝 -->
                
            </div>
        </div>
    </section>
    
    <script>
     function detailView(){
    	$(event.target).closest('tr').children('td').css('display', 'block');
     }
    
    </script>