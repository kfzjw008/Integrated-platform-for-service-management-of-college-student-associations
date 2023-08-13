<%--
  Created by IntelliJ IDEA.
  User: kfzjw008
  Date: 2019-07-11
  Time: 11:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta name="description" content="Vali is a responsive and free admin theme built with Bootstrap 4, SASS and PUG.js. It's fully customizable and modular."/>
    <!-- Twitter meta-->
    <meta property="twitter:card" content="summary_large_image"/>
    <meta property="twitter:site" content="@pratikborsadiya"/>
    <meta property="twitter:creator" content="@pratikborsadiya"/>
    <!-- Open Graph Meta-->
    <meta property="og:type" content="website"/>
    <meta property="og:site_name" content="Vali Admin"/>
    <meta property="og:title" content="Vali - Free Bootstrap 4 admin theme"/>
    <meta property="og:url" content="http://pratikborsadiya.in/blog/vali-admin"/>
    <meta property="og:image" content="http://pratikborsadiya.in/blog/vali-admin/hero-social.png"/>
    <meta property="og:description" content="Vali is a responsive and free admin theme built with Bootstrap 4, SASS and PUG.js. It's fully customizable and modular."/>

    <meta charset="utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <!-- Main CSS-->
    <link rel="stylesheet" type="text/css" href="../../sources/css/main.css"/>
    <link rel="stylsheet" type="text/ss" href="../../sources/css/all.css"/>
    <!-- Font-icon css-->
    <link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"/>
    <title>高中学生社团服务管理一体化平台</title>
</head>
<body class="app sidebar-mini rtl">
<div id="form1" runat="server">
    <!-- Navbar-->
    <header class="app-header"><a class="app-header__logo" href="index.html" style="font-size:13px">高中学生社团服务管理一体化平台</a>
        <a class="app-sidebar__toggle" href="#" data-toggle="sidebar" aria-label="Hide Sidebar"></a>
        <!-- Navbar Right Menu-->
        <ul class="app-nav">
            <li class="app-search">
                <input class="app-search__input" type="search" placeholder="查找">
                <button class="app-search__button"><i class="fa fa-search"></i></button>
            </li>
            <!--Notification Menu-->
            <li class="dropdown"><a class="app-nav__item" href="#" data-toggle="dropdown" aria-label="Show notifications"><i class="fa fa-bell-o fa-lg"></i></a>
                <ul class="app-notification dropdown-menu dropdown-menu-right">
                    <li class="app-notification__title">你有 3 条未读消息</li>
                    <div class="app-notification__content">
                        <li><a class="app-notification__item" href="javascript:;"><span class="app-notification__icon"><span class="fa-stack fa-lg"><i class="fa fa-circle fa-stack-2x text-primary"></i><i class="fa fa-envelope fa-stack-1x fa-inverse"></i></span></span>
                            <div>
                                <p class="app-notification__message">来自  社团联合会 的消息</p>
                                <p class="app-notification__meta">2天以前</p>
                            </div></a></li>
                        <li><a class="app-notification__item" href="javascript:;"><span class="app-notification__icon"><span class="fa-stack fa-lg"><i class="fa fa-circle fa-stack-2x text-danger"></i><i class="fa fa-hdd-o fa-stack-1x fa-inverse"></i></span></span>
                            <div>
                                <p class="app-notification__message">来自 社团联合会 的文件</p>
                                <p class="app-notification__meta">5天以前</p>
                            </div></a></li>
                        <li><a class="app-notification__item" href="javascript:;"><span class="app-notification__icon"><span class="fa-stack fa-lg"><i class="fa fa-circle fa-stack-2x text-success"></i><i class="fa fa-money fa-stack-1x fa-inverse"></i></span></span>
                            <div>
                                <p class="app-notification__message">来自 校团委 的公告</p>
                                <p class="app-notification__meta">7天以前</p>
                            </div></a></li>

                    </div>
                    <li class="app-notification__footer"><a href="#">忽略全部</a></li>
                </ul>
            </li>
            <!-- User Menu-->
            <li class="dropdown"><a class="app-nav__item" href="#" data-toggle="dropdown" aria-label="Open Profile Menu"><i class="fa fa-user fa-lg"></i></a>
                <ul class="dropdown-menu settings-menu dropdown-menu-right">
                    <li><a class="dropdown-item" href="ziliaoxiugai"><i class="fa fa-cog fa-lg"></i> 设置</a></li>
                    <li><a class="dropdown-item" href="ziliaoxiugai"><i class="fa fa-user fa-lg"></i>我的资料</a></li>
                    <li><a class="dropdown-item" href="index"><i class="fa fa-sign-out fa-lg"></i> 退出</a></li>
                </ul>
            </li>
        </ul>
    </header>
    <!-- Sidebar menu-->
    <div class="app-sidebar__overlay" data-toggle="sidebar"></div>
    <aside class="app-sidebar">
        <div class="app-sidebar__user"><img class="app-sidebar__user-avatar" src="https://s3.amazonaws.com/uifaces/faces/twitter/jsa/48.jpg" alt="User Image">
            <div>
                <p class="app-sidebar__user-name"><Label ID="Label1">${username}</Label></p>
                <p class="app-sidebar__user-designation"><Label ID="Label2">${userxh}</Label></p>
            </div>
        </div>
        <ul class="app-menu">
            <li><a class="app-menu__item " href="home"><i class="app-menu__icon fa fa-dashboard"></i><span class="app-menu__label">首页</span></a></li>
            <li><a class="app-menu__item" href="tzgg"><i class="app-menu__icon fa fa-pie-chart"></i><span class="app-menu__label">通知公告</span></a></li>
            <li class="treeview"><a class="app-menu__item" href="#" data-toggle="treeview"><i class="app-menu__icon fa fa-laptop"></i><span class="app-menu__label">我的社团</span><i class="treeview-indicator fa fa-angle-right"></i></a>
                <ul class="treeview-menu">
                    <li><a class="treeview-item" href="wjrd"><i class="icon fa fa-circle-o"></i> 我加入的社团</a></li>
                    <li><a class="treeview-item" href="wgld" ><i class="icon fa fa-circle-o"></i>我管理的社团</a></li>
                </ul>
            </li>

            <li class="treeview"><a class="app-menu__item active" href="#" data-toggle="treeview"><i class="app-menu__icon fa fa-edit"></i><span class="app-menu__label">社团列表</span><i class="treeview-indicator fa fa-angle-right"></i></a>
                <ul class="treeview-menu">
                    <li><a class="treeview-item" href="quanbushetuan"><i class="icon fa fa-circle-o"></i>全部社团</a></li>
                    <li><a class="treeview-item" href="youxiushetuan"><i class="icon fa fa-circle-o"></i> 优秀社团</a></li>
                    <li><a class="treeview-item" href="buhegeshetuan"><i class="icon fa fa-circle-o"></i> 不合格社团</a></li>
                </ul>
            </li>
            <li><a class="app-menu__item" href="chuangjianshetuan"><i class="app-menu__icon fa fa-th-list"></i><span class="app-menu__label">创建社团</span></a></li>

            </li>

            <li><a class="app-menu__item" href="ziliaoxiugai"><i class="app-menu__icon fa fa-th-list"></i><span class="app-menu__label">个人中心</span></a></li>
        </ul>
    </aside>
    <main class="app-content">
        <div class="row user">
            <div class="col-md-12">
                <div class="profile">
                    <div class="info"><img class="user-img" src="https://s3.amazonaws.com/uifaces/faces/twitter/jsa/48.jpg">
                        <h4>
                            <Label ID="Label4" runat="server" Text="Label">${shetuan.name}</Label></h4>
                        <p>协会编号：<Label ID="Label3" runat="server" Text="Label">${shetuan.id}</Label></p>
                    </div>
                    <div class="cover-image"></div>
                </div>
            </div>
            <div class="col-md-3">
                <div class="tile p-0">
                    <ul class="nav flex-column nav-tabs user-tabs">
                        <li class="nav-item"><a class="nav-link active" href="#shetuanxinxiweihu" data-toggle="tab">社团信息维护</a></li>
                        <li class="nav-item"><a class="nav-link" href="#huodonghechangdishenqing" data-toggle="tab">活动和场地申请</a></li>
                        <li class="nav-item"><a class="nav-link" href="#fuwushenqing" data-toggle="tab">服务申请</a></li>
                        <li class="nav-item"><a class="nav-link" href="#shiwushenqing" data-toggle="tab">事务申请</a></li>
                        <li class="nav-item"><a class="nav-link" href="#huiyuanguanli" data-toggle="tab">会员管理</a></li>
                        <li class="nav-item"><a class="nav-link" href="#zijinguanli" data-toggle="tab">资金管理</a></li>
                        <li class="nav-item"><a class="nav-link" href="#wodeshenqing" data-toggle="tab">我的申请</a></li>

                    </ul>
                </div>
            </div>
            <div class="col-md-9">
                <div class="tab-content">
                    <div class="tab-pane active" id="shetuanxinxiweihu">
                        <div class="tile user-settings" >
                            <h4 class="line-head">社团信息维护</h4>
                            <form action="updateshetuanServlet"  method="post">
                            <div>
                                <div class="row mb-4">
                                    <div class="col-md-4">
                                        <label>社团名称</label>
                                        <input ID="TextBox1" runat="server" name="name" class="form-control" type="text" value="${shetuan.name}" disabled="" >

                                    </div>
                                    <div class="col-md-4">
                                        <label>指导教师</label>
                                        <input ID="TextBox2" runat="server" name="teacher" class="form-control" type="text" value="${shetuan.teacher}"  placeholder="协会指导教师姓名">

                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-md-8 mb-4">
                                        <label>类别</label>
                                        <select  class="form-control" name="shetuan.item"  >
                                            <option  value="0" >-请选择-</option>
                                            <option  value="学术科技类"<c:if test="${'学术科技类' eq shetuan.item}">selected</c:if>>学术科技类</option>
                                            <option  value="文化艺术类"<c:if test="${'文化艺术类' eq shetuan.item}">selected</c:if>>文化艺术类</option>
                                            <option  value="志愿服务类"<c:if test="${'志愿服务类' eq shetuan.item}">selected</c:if>>志愿服务类</option>
                                            <option  value="体育类"<c:if test="${'体育类' eq shetuan.item}">selected</c:if>>体育类</option>
                                            <option  value="其他类"<c:if test="${'其他类' eq shetuan.item}">selected</c:if>>其他类</option>
                                        </select>

                                    </div>
                                    <div class="clearfix"></div>
                                    <div class="col-md-8 mb-4">
                                        <label>简介</label>
                                        <textarea  runat="server" class="form-control" rows="6" name="intention" >${shetuan.intention}</textarea>


                                    </div>
                                    <div class="clearfix"></div>
                                    <div class="col-md-8 mb-4">
                                        <label>公众号</label>
                                        <input ID="TextBox4" runat="server" class="form-control" name="wechat" type="text" placeholder="协会公众号的微信号" value="${shetuan.wechat}">

                                    </div>
                                    <div class="clearfix"></div>
                                    <div class="col-md-8 mb-4">
                                        <label>联系电话</label>
                                        <input ID="TextBox5" runat="server"  class="form-control" name="telephone" type="text" value="${shetuan.telephone}"  placeholder="填写修改后的联系电话，修改立即生效，留空则为不修改">

                                    </div>
                                </div>
                                <div class="row mb-10">
                                    <div class="col-md-12">
                                        <Button ID="Button1" runat="server" Text="保存并提交"   class="btn btn-primary" type="submit"  >保存并提交</Button>

                                    </div>
                                </div>
                            </div>
                            </form>
                        </div>
                    </div>

                    <div class="tab-pane fade" id="huodonghechangdishenqing">
                        <div class="tile shetuanhuodong">
                            <h4 class="line-head">活动和场地申请</h4>
                            <div>

                                <div class="row">
                                    <div class="col-md-8 mb-4">
                                        <label>活动名称</label>
                                        <input ID="TextBox6" runat="server" class="form-control" type="text" placeholder="协会打算主办活动的名称"  >

                                    </div>
                                </div>
                                <div class="row mb-4">
                                    <div class="col-md-4">
                                        <label>活动日期</label>
                                        <input ID="TextBox7" runat="server" class="form-control"  type="date" placeholder="协会活动的日期" >

                                    </div>
                                    <div class="col-md-4">
                                        <label>活动时间</label>
                                        <input ID="TextBox8" runat="server"  class="form-control" type="datetime-local" placeholder="协会活动的时间" >

                                    </div>
                                </div>
                                <div class="row">
                                    <div class="clearfix"></div>
                                    <div class="col-md-8 mb-4">
                                        <label>活动地点</label>
                                        <input ID="TextBox9" runat="server" class="form-control" type="text" placeholder="协会活动的地点，校外精确到详细地址，校内精确到楼名" >

                                    </div>
                                    <div class="clearfix"></div>
                                    <div class="col-md-8 mb-4">
                                        <label>活动简介</label>
                                        <textarea  runat="server" class="form-control" rows="6" >协会活动的内容简介</textarea>


                                    </div>
                                    <div class="clearfix"></div>
                                    <div class="col-md-8 mb-4">
                                        <label>活动场地</label>
                                        <input ID="TextBox11" runat="server" class="form-control" type="text" placeholder="如果协会需要借用场地请填写场地名称" >

                                    </div>
                                    <div class="clearfix"></div>
                                    <div class="col-md-8 mb-4">
                                        <label>经费预算</label>
                                        <input ID="TextBox12" runat="server" class="form-control" type="text" placeholder="请填写协会需要的经费预算，团委会在适当时期进行补助" >

                                    </div>
                                    <div class="clearfix"></div>
                                    <div class="col-md-8 mb-4">
                                        <label>其他需要说明的情况</label>
                                        <input ID="TextBox13" runat="server" class="form-control" type="text" placeholder="以上未交代清楚的内容，选填" >

                                    </div>
                                </div>
                                <div class="row mb-10">
                                    <div class="col-md-12">
                                        <Button ID="Button2" runat="server" Text="提交申请" class="btn btn-primary" type="button" >提交申请</Button>

                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="tab-pane fade" id="fuwushenqing">
                        <div class="tile shetuanhuodong">
                            <h4 class="line-head">服务申请</h4>
                            <div>

                                <div class="row">
                                    <div class="col-md-8 mb-4">
                                        <label>服务类别</label>
                                        <select  class="form-control">
                                            <option>-请选择-</option>
                                            <option>活动需要人手进行引导协助等</option>
                                            <option>需要校方协助作为活动主办或承办</option>
                                            <option>需要校方提供学校其他物品车辆或者设施</option>
                                            <option>需要校方报销部分预算</option>
                                            <option>其他</option>
                                        </select>


                                    </div>
                                </div>
                                <div class="row mb-4">
                                    <div class="col-md-4">
                                        <label>服务时间</label>
                                        <input ID="TextBox15" runat="server" class="form-control" type="text" placeholder="需要服务的时间">

                                    </div>
                                    <div class="col-md-4">
                                        <label>服务地点</label>
                                        <input ID="TextBox16" runat="server" class="form-control" type="text" placeholder="需要提供服务的地点，没有可不填">

                                    </div>
                                </div>
                                <div class="row">
                                    <div class="clearfix"></div>
                                    <div class="col-md-8 mb-4">
                                        <label>服务简介</label>
                                        <textarea  runat="server" class="form-control" rows="6" >简要说明需要提供服务的内容，原因等。应当将事情交代清楚。</textarea>


                                    </div>


                                </div>
                                <div class="row mb-10">
                                    <div class="col-md-12">
                                        <Button ID="Button3" runat="server" Text="提交申请"  class="btn btn-primary" type="button" OnClick="Button3_Click" >提交申请</Button>

                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="tab-pane fade" id="shiwushenqing">
                        <div class="tile shetuanhuodong">
                            <h4 class="line-head">社团事务申请</h4>
                            <div>

                                <div class="row">
                                    <div class="col-md-8 mb-4">
                                        <label>事务类别</label>
                                        <select  class="form-control">
                                            <option>-请选择-</option>
                                            <option>协会名称变更申请</option>
                                            <option>条幅海报申请</option>
                                            <option>刻制印章申请</option>
                                            <option>章程修改申请</option>
                                            <option>其他</option>
                                        </select>


                                    </div>
                                </div>

                                <div class="row">
                                    <div class="clearfix"></div>
                                    <div class="col-md-8 mb-4">
                                        <label>事务内容</label>
                                        <textarea  runat="server" class="form-control" rows="6" >详细交代需要申请完成事务的内容，例如交代清楚变更的名称，交代清楚条幅海报的内容等</textarea>


                                    </div>
                                    <div class="clearfix"></div>
                                    <div class="col-md-8 mb-4">
                                        <label>原因</label>

                                        <input ID="TextBox14" runat="server"  class="form-control" type="text" placeholder="详细交代需要申请事务的原因，例如交代变更名称的原因，刻制印章悬挂条幅的目的等。" Rows="5" TextMode="MultiLine">
                                    </div>


                                </div>
                                <div class="row mb-10">
                                    <div class="col-md-12">
                                        <Button ID="Button4" runat="server" Text="提交" class="btn btn-primary" type="button" OnClick="Button4_Click"  >提交</Button>

                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="tab-pane fade" id="huiyuanguanli">
                        <div class="timeline-post">
                            <h4 class="line-head">会员管理</h4>
                            <div class="col-12 table-responsive">

                                <table class="table table-striped table-bordered table-condensed"  >
                                    <tr>
                                        <th>用户编号</th>
                                        <th>账号</th>
                                        <th>姓名</th>
                                        <th>学院</th>
                                        <th>专业</th>
                                        <th>电话</th>
                                        <th>取消会员</th>
                                        <th>增加管理员</th>


                                    </tr>

                                    <c:forEach items="${users}" var="u">
                                        <tr>
                                            <td>${u.id }</td>
                                            <td>${u.userName}</td>
                                            <td>${u.name }</td>
                                            <td>${u.college }</td>
                                            <td>${u.zhuanye }</td>
                                            <td>${u.mobile }</td>
                                            <td><a href="admindeleteuserServlet?uid=${u.id}">删除</a></td>

                                            <td><a href="DeleteUserServlet?uid=${u.id}">设为管理员</a></td>

                                        </tr>
                                    </c:forEach>

                                </table>


                            </div>



                        </div>
                    </div>
                    <div class="tab-pane fade" id="zijinguanli">
                        <div class="timeline-post">
                            <h4 class="line-head">资金管理</h4>

                        </div>
                    </div>

                    <div class="tab-pane fade" id="wodeshenqing">
                        <div class="timeline-post">
                            <h4 class="line-head">我的申请</h4>
                            <div class="col-12 table-responsive">

                                <table class="table table-striped table-bordered table-condensed"  >
                                    <tr>
                                        <th>申请单号</th>
                                        <th>服务时间</th>
                                        <th>服务地点</th>
                                        <th>服务类别</th>
                                        <th>服务简介</th>
                                        <th>申请状态</th>

                                    </tr>

                                    <c:forEach items="${students}" var="u">
                                        <tr>
                                            <td>${u.id }</td>
                                            <td>${u.time }</td>
                                            <td>${u.name }</td>
                                            <td>${u.clazz }</td>
                                            <td>${u.time }</td>
                                            <td>${u.time }</td>
                                        </tr>
                                    </c:forEach>

                                </table>

                            </div>
                            <div class="col-12 table-responsive">


                                <table class="table table-striped table-bordered table-condensed"  >
                                    <tr>
                                        <th>活动单</th>
                                        <th>日期</th>
                                        <th>时间</th>
                                        <th>地点</th>
                                        <th>名称</th>
                                        <th>简介</th>
                                        <th>申请状态</th>

                                    </tr>

                                    <c:forEach items="${students}" var="u">
                                        <tr>
                                            <td>${u.id }</td>
                                            <td>${u.time }</td>
                                            <td>${u.name }</td>
                                            <td>${u.clazz }</td>
                                            <td>${u.time }</td>
                                            <td>${u.time }</td>
                                            <td>${u.time }</td>
                                        </tr>
                                    </c:forEach>

                                </table>
                            </div>
                            <div class="col-12 table-responsive">



                                <table class="table table-striped table-bordered table-condensed"  >
                                    <tr>
                                        <th>单号</th>
                                        <th>类别</th>
                                        <th>内容</th>
                                        <th>申请原因</th>
                                        <th>申请状态</th>


                                    </tr>

                                    <c:forEach items="${students}" var="u">
                                        <tr>
                                            <td>${u.id }</td>
                                            <td>${u.time }</td>
                                            <td>${u.name }</td>
                                            <td>${u.clazz }</td>
                                            <td>${u.time }</td>

                                        </tr>
                                    </c:forEach>

                                </table>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </main>
    <!-- Essential javascripts for application to work-->
    <script src="../../sources/js/jquery-3.2.1.min.js"></script>
    <script src="../../sources/js/popper.min.js"></script>
    <script src="../../sources/js/bootstrap.min.js"></script>
    <script src="../../sources/js/main.js"></script>
    <!-- The javascript plugin to display page loading on top-->
    <script src="../../sources/js/plugins/pace.min.js"></script>
    <!-- Page specific javascripts-->
    <script type="text/javascript" src="../../sources/js/plugins/chart.js"></script>


</div>
</body>
</html>
