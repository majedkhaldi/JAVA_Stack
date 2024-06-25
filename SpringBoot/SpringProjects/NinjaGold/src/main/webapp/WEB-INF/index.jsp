<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Ninja Gold Game</title>
	<link rel="stylesheet" type="text/css" href="/css/style.css">   
</head>
<body>
    <div class="top">
        <div class="gold">
            <h1>Your Gold</h1>
            <div class="goldcount"><c:out value="${counter}"></c:out> </div>
        </div>
        <div>
            <a href="/reset"><button>RESET</button></a>
        </div>
        <!-- <div class="userspecifications">
            <form action="specify" method="post">
                {% csrf_token %}
                <label>number of clicks</label>
                <input type="number" min="0" name="trials">
                <label>goal of golds</label>
                <input type="number" name="goalofgolds">
                <button>submit</button>
            </form>
        </div> -->
    </div>
    
    <div class="boxes">
        <div class="activitybox">
            <h1>Farm</h1>
            <p>(earn 10-20 gold)</p>
            <!-- <button><a href="/tentotwenty/farm">Find Gold</a></button> -->
            <form action="/findgold" method="post">
                <input type="hidden" name="place" value="farm">
                <button>Find Gold</button>
            </form>
        </div>
        <div class="activitybox">
            <h1>Spa</h1>
            <p>(pay 5-20 gold)</p>
            <!-- <button><a href="/tentotwenty/farm">Find Gold</a></button> -->
            <form action="/findgold" method="post">
                <input type="hidden" name="place" value="spa">
                <button>Pay Gold</button>
            </form>
        </div>
        <div class="activitybox">
            <h1>Cave</h1>
            <p>(earn 5-10 gold)</p>
            <!-- <button><a href="/tentotwenty/cave">Find Gold</a></button> -->
            <form action="/findgold" method="post">
                <input type="hidden" name="place" value="cave">
                <button>Find Gold</button>
            </form>
        </div>
        <div class="activitybox">
            <h1>House</h1>
            <p>(earn 2-5 gold)</p>
            <!-- <button><a href="/tentotwenty/house">Find Gold</a></button> -->
            <form action="/findgold" method="post">
                <input type="hidden" name="place" value="house">
                <button>Find Gold</button>
            </form>
        </div>
        <div class="activitybox">
            <h1>Quest</h1>
            <p>(earns/takes 0-50 gold)</p>
            <!-- <button><a href="/addorlose/quest">Find Gold</a></button> -->
            <form action="/findgold" method="post">
                <input type="hidden" name="place" value="quest">
                <button>Find Gold</button>
            </form>
        </div>
    </div>
    <div class="activity">
        <h1>Activity</h1>
        <div class="activity_log">
            <c:forEach var="item" items="${array}">
                    <c:if test="${item.indexOf('won') != -1}">
                        <p class="green">
                            <c:out value="${item}" />
                        </p>
                    </c:if>
                    <c:if test="${item.indexOf('lost') != -1}">
                        <p class="red">
                            <c:out value="${item}" />
                        </p>
                    </c:if>
			</c:forEach>
        </div>
    </div>
</body>
</html>