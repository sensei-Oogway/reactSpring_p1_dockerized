const { createProxyMiddleware } = require("http-proxy-middleware");


module.exports = function (app) {
  app.use(
    createProxyMiddleware({
      target: process.env.REACT_APP_PROXY_ADDR,
      changeOrigin: true,
      pathFilter: '/api',
      pathRewrite: {'^/api(.*)' : '/api/hello'}
    })
  );
};