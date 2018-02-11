//index.js
//获取应用实例
const app = getApp()

Page({
  data: {
    list: [
      { 'id': '1', 'name': '今日特惠' },
      { 'id': '2', 'name': '年货' },
      { 'id': '3', 'name': '水果' },
      { 'id': '4', 'name': '蔬菜' },
      { 'id': '5', 'name': '乳品' },
      { 'id': '6', 'name': '肉蛋' },
      { 'id': '7', 'name': '零食' },
      { 'id': '8', 'name': '日用品' },
      { 'id': '9', 'name': '服装' },
      { 'id': '10', 'name': '电器' },
      { 'id': '11', 'name': '汽车' },
    ],
    curMeal: 0,
    motto: 'Hello World',
    userInfo: {},
    hasUserInfo: false,
    canIUse: wx.canIUse('button.open-type.getUserInfo')
  },
  //事件处理函数
  bindViewTap: function() {
    wx.navigateTo({
      url: '../logs/logs'
    })
  },
  onLoad: function () {
    if (app.globalData.userInfo) {
      this.setData({
        userInfo: app.globalData.userInfo,
        hasUserInfo: true
      })
    } else if (this.data.canIUse){
      // 由于 getUserInfo 是网络请求，可能会在 Page.onLoad 之后才返回
      // 所以此处加入 callback 以防止这种情况
      app.userInfoReadyCallback = res => {
        this.setData({
          userInfo: res.userInfo,
          hasUserInfo: true
        })
      }
    } else {
      // 在没有 open-type=getUserInfo 版本的兼容处理
      wx.getUserInfo({
        success: res => {
          app.globalData.userInfo = res.userInfo
          this.setData({
            userInfo: res.userInfo,
            hasUserInfo: true
          })
        }
      })
    }
  },
  getUserInfo: function(e) {
    console.log(e)
    app.globalData.userInfo = e.detail.userInfo
    this.setData({
      userInfo: e.detail.userInfo,
      hasUserInfo: true
    })
  },
  /*
    点击选中项并改变其样式
  */
  selectMeal: function (e) {
    this.setData({ curMeal: e.currentTarget.dataset.index });
    console.log(e);
  }
})
