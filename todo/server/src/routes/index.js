const express = require('express')
const router = express.Router() // 서브 라우터
const todo = require('./todo')

// /api/todos/ => todo 모듈을 실행
router.use('/todos', todo)

module.exports = router