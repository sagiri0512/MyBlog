<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>常用代码</title>
    <link href="https://sagirinoinu.top/css/bootstrap.min.css" rel="stylesheet">
    <!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery) -->
    <script src="https://sagirinoinu.top/js/jquery-3.7.1.js"></script>
    <!-- 包括所有已编译的插件 -->
    <script src="https://sagirinoinu.top/js/bootstrap.min.js"></script>
    <!-- FontAwesome 图标库 -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
    <style>
        body {
            background-image: url('https://sagirinoinu.top/img/sagiri2.png');
            background-size: cover; /* 使背景图像覆盖整个屏幕 */
            background-position: center; /* 使背景图像居中 */
            background-repeat: no-repeat; /* 避免图像重复 */
            margin: 0; /* 去除默认的边距 */
            padding: 0; /* 去除默认的内边距 */
            height: 100vh; /* 确保 body 高度为视口高度 */
            font-family: 'Arial', sans-serif; /* 更改字体 */
            color: #333; /* 设置默认字体颜色 */
            overflow: hidden; /* 防止滚动条出现 */
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
        /* 页面内容 */
        .container {
            padding-top: 80px; /* 使内容不会被固定导航栏遮挡 */
            text-align: center; /* 居中对齐文本 */
        }
        .container h1 {
            font-size: 3rem;
            margin-bottom: 20px;
            color: #4b0082; /* 设置标题颜色 */
        }
        .container h3 {
            font-size: 1.5rem;
            color: #4b0082; /* 设置副标题颜色 */
        }
        /* 搜索框样式 */
        .search-container {
            text-align: center;
            margin-top: 100px; /* 确保搜索框位于导航栏下方 */
        }
        .search-box {
            display: flex;
            justify-content: center;
            align-items: center;
            max-width: 600px;
            margin: 0 auto;
            border-radius: 5px;
            overflow: hidden; /* 确保边框圆角生效 */
        }
        .search-box input[type="text"] {
            border: 1px solid #ddd;
            padding: 10px;
            font-size: 1rem;
            border-radius: 5px 0 0 5px;
            outline: none;
            width: 100%;
            height: 37.6px;
            box-sizing: border-box; /* 确保 padding 和 border 被包含在 width 之内 */
        }
        .search-box button {
            border: 1px solid #ddd;
            background-color: #007bff;
            color: #fff;
            padding: 10px;
            border-radius: 0 5px 5px 0;
            cursor: pointer;
            display: flex;
            align-items: center;
            justify-content: center;
            height: 37.6px;/* 确保按钮和输入框的高度一致 */
        }
        .search-box button i {
            font-size: 1rem;
        }
        /* 响应式设计 */
        @media (max-width: 768px) {
            nav {
                flex-direction: column; /* 在小屏幕上，导航栏内容纵向排列 */
                align-items: flex-start;
            }
            nav h1 {
                margin-bottom: 10px; /* 标题与导航链接之间的间距 */
            }
            nav a {
                display: block;
                margin: 5px 0;
            }
            .container {
                padding-top: 60px;
            }
            .search-container {
                margin-top: 50px;
            }
        }
    </style>
</head>
<body>
<nav>
    <h1 class="text-center">常用代码</h1>
    <div>
        <a href="/blog/index/index">首页</a>
        <a href="/blog/common/common">常用</a>
        <a href="https://github.com/sagiri0512">仓库</a>
        <a href="/blog/myProject/myProject">项目</a>
    </div>
</nav>

<!-- 搜索框 -->
<div class="search-container">
    <div class="search-box">
        <input type="text" placeholder="搜索...">
        <button type="button">
            <i class="fa fa-search"></i>
        </button>
    </div>
</div>

</body>
</html>
