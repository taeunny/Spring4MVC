<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<main>
    <h2>회원가입</h2>
    <form name="joinfrm">
        <div><label for="userid">아이디</label>
            <input type="text" name="userid" id="userid"></div>
        <div><label for="passwd">비밀번호</label>
            <input type="text" name="passwd" id="passwd"></div>
        <div><label for="repwd">비밀번호 확인</label>
            <input type="text" name="repwd" id="repwd"></div>
        <div><label for="name">이름</label>
            <input type="name" name="name" id="name"></div>
        <div><label for="email">이메일</label>
            <input type="email" name="email" id="email"></div>
        <div><label></label>
            <button type="button" class="btn btn-primary" id="joinbtn">입력완료</button>
            <button type="reset" class="btn btn-danger">입력취소</button>
        </div>
    </form>
</main>
<script src="/assets/js/member.js"></script>