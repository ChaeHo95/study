import React from 'react'

// function Movie({ id, title, language, release, length, author, production }){
//     return (
//         <>
//             <h1>무비 정보</h1>
//             <h3>{title}</h3>
//             <h3>{language}</h3>
//             <h3>{release}</h3>
//             <h3>{length}</h3>
//             <h3>{author}</h3>
//             <h3>{production}</h3>
//         </>
//     )
// }
function Movie({ id, ...rest}){
    return (
        <>
            <h1>무비 정보</h1>
            <h3>{rest.title}</h3>
            <h3>{rest.language}</h3>
            <h3>{rest.release}</h3>
            <h3>{rest.length}</h3>
            <h3>{rest.author}</h3>
            <h3>{rest.production}</h3>
        </>
    )
}
export default Movie