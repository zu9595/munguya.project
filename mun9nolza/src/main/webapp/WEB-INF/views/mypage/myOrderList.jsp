<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>


<style>

/*  .orderHidden {
	display: none;
} */

</style>
<script src="js/mypagejs/myOrderList.js"></script>

                <!-- 바뀌는 구역 -->       
         <!--        <div class="col-lg-9">
                   <h3>주문내역</h3>
                   
                   <div style="width: 720px; height: 640px; padding: 50px">
                     <table class="table addOrderList">
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
                       <c:forEach var="vo" items="${orderList}">
                       <tr>
                        <td><fmt:formatDate value="${vo.orderDate }" pattern="yyyy-MM-dd"></fmt:formatDate></td>
                        <td>${vo.orderNo }</td>
                        <td> ${vo.proName } 등</td>
                        <td><span class="status">${vo.orderStatus }</span></td>
                        <!-- <td><button onclick="detailView()">상세조회</button></td> --> <!-- 확인하기 -->
                        <td><button onclick="detailSelect()">상세조회</button></td>
                       </tr>         -->
                       
                       <%-- <!-- 상세조회 -->
                       <tr class="orderHidden detail">
                        <td colspan="5">
                        
                       <table class="table">
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
                       	 <td><button onclick="removeOrder(${vo.orderNo})">주문취소</button></td>
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
                       </tr> --%>
            <!--           </c:forEach> 
                     </tbody>   
                      
                      
                     </table>  
                   </div>          
              </div>                     -->  
               <!-- 바뀌는 구역 끝 -->

    
<!--     <script>

    
    </script> -->