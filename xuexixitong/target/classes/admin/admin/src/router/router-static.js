import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'

         import users from '@/views/modules/users/list'
        import dictionary from '@/views/modules/dictionary/list'
        import exampaper from '@/views/modules/exampaper/list'
        import examquestion from '@/views/modules/examquestion/list'
        import examrecord from '@/views/modules/examrecord/list'
        import examredetails from '@/views/modules/examredetails/list'
        import examrewrongquestion from '@/views/modules/examrewrongquestion/list'
        import forum from '@/views/modules/forum/list'
        import jiaoshi from '@/views/modules/jiaoshi/list'
        import kaoqinqingjia from '@/views/modules/kaoqinqingjia/list'
        import kaoqinxiangqing from '@/views/modules/kaoqinxiangqing/list'
        import kecheng from '@/views/modules/kecheng/list'
        import kechengzuoye from '@/views/modules/kechengzuoye/list'
        import kechnegkaoqin from '@/views/modules/kechnegkaoqin/list'
        import xuesheng from '@/views/modules/xuesheng/list'
        import xuexishipin from '@/views/modules/xuexishipin/list'
        import xuexiziliao from '@/views/modules/xuexiziliao/list'
        import config from '@/views/modules/config/list'
        import dictionaryBanji from '@/views/modules/dictionaryBanji/list'
        import dictionaryExampaper from '@/views/modules/dictionaryExampaper/list'
        import dictionaryExamquestion from '@/views/modules/dictionaryExamquestion/list'
        import dictionaryForum from '@/views/modules/dictionaryForum/list'
        import dictionaryKaoqin from '@/views/modules/dictionaryKaoqin/list'
        import dictionaryKaoqinqingjia from '@/views/modules/dictionaryKaoqinqingjia/list'
        import dictionaryKecheng from '@/views/modules/dictionaryKecheng/list'
        import dictionarySex from '@/views/modules/dictionarySex/list'
		
		import exampaperlist from '@/views/modules/exampaperlist/list'
		import addkechnegkaoqin from '@/views/modules/kechnegkaoqin/add-or-update'
		 import adminexam from '@/views/modules/exampaperlist/exam'
		
		




//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    } ,{
        path: '/users',
        name: '管理信息',
        component: users
      }
	  ,{
	      path: '/addkechnegkaoqin',
	      name: '考勤添加',
	      component: addkechnegkaoqin
	  }
	  ,{
	      path: '/adminexam',
	      name: 'adminexam',
	      component: adminexam,
	      meta: {icon:'', title:'adminexam'}
	    }
	  
    ,{
        path: '/dictionaryBanji',
        name: '班级名称',
        component: dictionaryBanji
    }
    ,{
        path: '/dictionaryExampaper',
        name: '试卷状态',
        component: dictionaryExampaper
    }
    ,{
        path: '/dictionaryExamquestion',
        name: '试题类型',
        component: dictionaryExamquestion
    }
    ,{
        path: '/dictionaryForum',
        name: '帖子类型名称',
        component: dictionaryForum
    }
    ,{
        path: '/dictionaryKaoqin',
        name: '考勤状态',
        component: dictionaryKaoqin
    }
    ,{
        path: '/dictionaryKaoqinqingjia',
        name: '考勤状态',
        component: dictionaryKaoqinqingjia
    }
    ,{
        path: '/dictionaryKecheng',
        name: '课程类型名称',
        component: dictionaryKecheng
    }
	,{
	    path: '/exampaperlist',
	    name: '试卷列表',
	    component: exampaperlist
	}
    ,{
        path: '/dictionarySex',
        name: '性别',
        component: dictionarySex
    }
    ,{
        path: '/config',
        name: '轮播图',
        component: config
    }


    ,{
        path: '/dictionary',
        name: '字典表',
        component: dictionary
      }
    ,{
        path: '/exampaper',
        name: '试卷表',
        component: exampaper
      }
    ,{
        path: '/examquestion',
        name: '试题表',
        component: examquestion
      }
    ,{
        path: '/examrecord',
        name: '考试记录表',
        component: examrecord
      }
    ,{
        path: '/examredetails',
        name: '答题详情表',
        component: examredetails
      }
    ,{
        path: '/examrewrongquestion',
        name: '错题表',
        component: examrewrongquestion
      }
    ,{
        path: '/forum',
        name: '论坛',
        component: forum
      }
    ,{
        path: '/jiaoshi',
        name: '教师',
        component: jiaoshi
      }
    ,{
        path: '/kaoqinqingjia',
        name: '考勤请假',
        component: kaoqinqingjia
      }
    ,{
        path: '/kaoqinxiangqing',
        name: '课程考勤详情',
        component: kaoqinxiangqing
      }
    ,{
        path: '/kecheng',
        name: '课程信息',
        component: kecheng
      }
    ,{
        path: '/kechengzuoye',
        name: '课程作业',
        component: kechengzuoye
      }
    ,{
        path: '/kechnegkaoqin',
        name: '课程考勤',
        component: kechnegkaoqin
      }
    ,{
        path: '/xuesheng',
        name: '学生',
        component: xuesheng
      }
    ,{
        path: '/xuexishipin',
        name: '学习视频',
        component: xuexishipin
      }
    ,{
        path: '/xuexiziliao',
        name: '学习资料',
        component: xuexiziliao
      }


    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
