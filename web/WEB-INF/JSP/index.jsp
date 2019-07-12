<%--
  Created by IntelliJ IDEA.
  User: kfzjw008
  Date: 2019-07-07
  Time: 17:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head >
    <c:url value="/" var="basepath"></c:url>
    <base href="${basepath }">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta charset="utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <!-- Main CSS-->
    <link rel="stylesheet" type="text/css" href="../../sources/css/main.css"/>
    <link rel="stylsheet" type="text/ss" href="../../sources/css/all.css"/>
    <!-- Font-icon css-->
    <link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"/>
    <title>高校学生社团服务管理一体化平台——登录</title>
</head>
<body>
<div >
    <div>
        <section class="material-half-bg">
            <div class="cover"></div>
        </section>
        <section class="login-content">
            <div class="logo">
                <h1>高校学生社团服务管理一体化平台</h1>
            </div>
            <div class="login-box">
                <form class="login-form" action="htindexServlet"  method="post" >
                    <h3 class="login-head"><i class="fa fa-lg fa-fw fa-user"></i>用户登录</h3>
                    <div class="form-group">
                        <label class="control-label">学号</label>
                        <input class="form-control" name="username" type="text" placeholder="请输入学号" >

                    </div>
                    <div class="form-group">
                        <label class="control-label">密码</label>
                        <input class="form-control" name="password" type="password" placeholder="请输入密码">

                    </div>
                    <div class="form-group">
                        <div class="utility">
                            <div class="animated-checkbox">
                                <label>
                                    <input   type="checkbox">
                                    <span class="label-text">保持登录状态</span>
                                </label>
                            </div>
                            <p class="semibold-text mb-2"><a href="#" data-toggle="flip">注册账号</a></p>
                        </div>
                    </div>
                    <div class="form-group btn-container">
                        <button Text="登录" class="btn btn-primary btn-block" \ >登录</button>

                    </div>
                </form>
                <form class="forget-form" action="AddUserServlet"  method="post" >
                    <h3 class="login-head"><i class="fa fa-lg fa-fw fa-lock"></i>注册用户</h3>

                    <div class="form-group">
                        <label class="control-label">学号</label>
                        <input class="form-control" type="text" placeholder="请输入学号" name="schoolid">
                    </div>
                    <div class="form-group btn-container">
                        <Button ID="Button2"  Text="注册" class="btn btn-primary btn-block"  > 注册 </Button>
                    </div>

                    <div class="form-group mt-3">
                        <p class="semibold-text mb-0"><a href="#" data-toggle="flip"><i class="fa fa-angle-left fa-fw"></i> 返回登录</a></p>

                    </div>
                </form>

            </div>
        </section>

        <!-- Essential javascripts for application to work-->
        <script src="../../sources/js/jquery-3.2.1.min.js"></script>
        <script src="../../sources/js/popper.min.js"></script>
        <script src="../../sources/js/bootstrap.min.js"></script>
        <script src="../../sources/js/main.js"></script>
        <!-- The javascript plugin to display page loading on top-->
        <script src="../../sources/js/plugins/pace.min.js"></script>
        <script type="text/javascript">
            // Login Page Flipbox control
            $('.login-content [data-toggle="flip"]').click(function() {
                $('.login-box').toggleClass('flipped');
                return false;
            });
        </script>

    </div>
</div>
</body>
</html>

