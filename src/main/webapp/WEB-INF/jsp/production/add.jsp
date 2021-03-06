<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/jsp/common/common.jsp" %>
<script language="javascript" src="${pageContext.request.contextPath}/js/user_add.js"></script>
<html>
<head>
    <title>产品信息</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
</head>
<body>

<!-- 标题显示 -->
<div id="Title_bar">
    <div id="Title_bar_Head">
        <div id="Title_Head"></div>
        <div id="Title"><!--页面标题-->
            <img border="0" width="13" height="13" src="${pageContext.request.contextPath}/css/images/title_arrow.gif"/>
            产品信息
        </div>
        <div id="Title_End"></div>
    </div>
</div>

<!--显示表单内容-->
<div id=MainArea>
    <s:form action="userAction_add.action">
        <div class="ItemBlock_Title1"><!-- 信息说明 -->
            <div class="ItemBlock_Title1">
                <img border="0" width="4" height="7"
                     src="${pageContext.request.contextPath}/css/blue/images/item_point.gif"/>产品信息
            </div>
        </div>

        <!-- 表单内容显示 -->
        <div class="ItemBlockBorder">
            <div class="ItemBlock">
                <table cellpadding="0" cellspacing="0" class="mainForm">
                    <tr>
                        <td width="100">所属商家</td>
                        <!--
                            list 数据的来源
                            listValue 显示的文本内容
                            listKey   option的属性value的值
                         -->

                        <td><s:select list="#sellerList" listKey="sid" listValue="name" headerKey=""
                                      headerValue="请选择商家" name="sid" cssClass="SelectStyle"></s:select>
                        </td>
                    </tr>
                    <tr>
                        <td>产品名</td>
                        <td><s:textfield name="pid" cssClass="InputStyle"></s:textfield>
                            （登录名要唯一）
                            <%--需要修改--%>
                        </td>
                    </tr>
                    <tr>
                        <td>价格</td>
                        <td><s:textfield name="price" cssClass="InputStyle"></s:textfield></td>
                        </td>
                    </tr>
                    <tr>
                        <td>卖方对买方的价格偏好系数</td>
                        <td><s:textfield name="pPriceRate" cssClass="InputStyle"></s:textfield></td>
                    </tr>
                    <tr>
                        <td>卖方信誉度</td>
                        <td><s:textfield name="pReputation" cssClass="InputStyle"></s:textfield></td>
                    </tr>
                    <tr>
                        <td>卖方对买方的信誉偏好系数</td>
                        <td><s:textfield name="pReputation" cssClass="InputStyle"></s:textfield></td>
                    </tr>
                    <tr>
                        <td>卖方的服务质量</td>
                        <td><s:textfield name="pReputation" cssClass="InputStyle"></s:textfield></td>
                    </tr>
                </table>
            </div>
        </div>
        <!-- 表单操作 -->
        <div id="InputDetailBar">
            <input type="image" src="${pageContext.request.contextPath}/css/images/save.png"/>
            <a href="javascript:history.go(-1);"><img
                    src="${pageContext.request.contextPath}/css/images/goBack.png"/></a>
        </div>
    </s:form>
</div>
</body>
</html>
