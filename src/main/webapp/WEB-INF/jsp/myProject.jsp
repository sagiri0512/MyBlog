<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>我参与的项目</title>
    <link href="https://sagirinoinu.top/css/bootstrap.min.css" rel="stylesheet">
    <!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery) -->
    <script src="https://sagirinoinu.top/js/jquery-3.7.1.js"></script>
    <!-- 包括所有已编译的插件 -->
    <script src="https://sagirinoinu.top/js/bootstrap.min.js"></script>
    <style>
        body {
            background-image: url('https://sagirinoinu.top/img/sagiri2.png');
            background-size: cover; /* 使背景图像覆盖整个屏幕 */
            background-position: center; /* 使背景图像居中 */
            background-repeat: no-repeat; /* 避免图像重复 */
            margin: 0; /* 去除默认的边距 */
            padding: 0; /* 去除默认的内边距 */
            height: 100vh; /* 确保 body 高度为视口高度 */
        }
        /* 美化导航栏 */
        nav {
            background-color: rgba(0, 0, 255, 0.3); /* 半透明蓝色背景 */
            color: #fff;
            padding: 15px 30px;
            position: fixed;
            width: 100%;
            top: 0;
            left: 0;
            z-index: 1000; /* 确保导航栏在其他内容之上 */
            display: flex;
            align-items: center;
            justify-content: space-between; /* 左右对齐导航项和标题 */
        }
        nav a {
            color: #fff;
            text-decoration: none;
            padding: 10px 20px;
            margin: 0 10px;
            border-radius: 5px; /* 添加圆角效果 */
            transition: background-color 0.3s; /* 添加过渡效果 */
        }
        nav a:hover {
            background-color: rgba(0, 0, 255, 0.5); /* 半透明蓝色背景 */
        }
        nav h1 {
            color: #fff; /* 确保标题文字颜色适合背景 */
            font-size: 1.5rem; /* 调整标题字体大小 */
            margin: 0; /* 去除默认的外边距 */
        }
        /* 自定义CSS以固定表格格子的大小 */
        .table th, .table td {
            width: 25%; /* 每个格子占表格宽度的25% */
            word-wrap: break-word; /* 允许长词在格子内换行 */
            white-space: normal; /* 允许内容换行 */
            text-align: center; /* 内容居中 */
            vertical-align: middle; /* 内容垂直居中 */
            color: #4b0082; /* 设置副标题颜色 */
        }
        table {
            background-color: rgba(255, 255, 255, 0.5); /* 半透明白色背景 */
            table-layout: fixed; /* 固定表格布局 */
        }
        .divBody {
            padding: 80px 50px 0 50px; /* 顶部填充避免被导航栏遮挡 */
        }
    </style>
</head>

<body>
<nav>
    <h1 class="text-center">我参与的项目</h1>
    <div>
        <a href="/blog/index/index">首页</a>
        <a href="https://github.com/sagiri0512">仓库</a>
        <a href="/blog/myProject/myProject">项目</a>
    </div>
</nav>
<div class="divBody">
    <table class="table table-bordered table-striped">
        <thead>
        <tr>
            <th>项目名</th>
            <th>项目简介</th>
            <th>项目源码</th>
            <th>项目部署地址</th>
        </tr>
        </thead>
        <tbody id="projectTableBody">
        </tbody>
    </table>
</div>
</body>

<script>
    $(function () {
        $.ajax({
            url: "/blog/myProject/getAllProject",
            type: "GET",
            success: function (res) {
                const projectTableBody = $("#projectTableBody");
                res.forEach(function (project) {
                    var row = '<tr class="active">';
                    row += '<td>' + project.projectName + '</td>';
                    row += '<td>' + project.projectSynopsis + '</td>';
                    row += '<td><a href="' + project.projectSource + '" target="_blank">源码</a></td>';
                    row += '<td><a href="' + project.projectUrl + '" target="_blank">访问</a></td>';
                    row += '</tr>';
                    projectTableBody.append(row);
                });
            },
            error: function (err) {
                console.error("请求失败：", err);
            }
        });
    });
</script>
</html>
