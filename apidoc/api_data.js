define({ "api": [
  {
    "type": "POST",
    "url": "/add",
    "title": "创建账户",
    "group": "Accound",
    "version": "1.0.0",
    "description": "<p>用于注册用户</p>",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "Account",
            "optional": false,
            "field": "account",
            "description": "<p>账户对象</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "请求示例：",
          "content": "{\"name\":\"zhangsan\", \"money\":1000}",
          "type": "json"
        }
      ]
    },
    "success": {
      "fields": {
        "200": [
          {
            "group": "200",
            "type": "int",
            "optional": false,
            "field": "code",
            "description": "<p>0成功 1失败</p>"
          },
          {
            "group": "200",
            "type": "String",
            "optional": false,
            "field": "msg",
            "description": "<p>信息</p>"
          }
        ]
      }
    },
    "filename": "zmz-demo/src/main/java/com/tiger/zmz/demo/controller/AccountController.java",
    "groupTitle": "Accound",
    "name": "PostAdd"
  }
] });
