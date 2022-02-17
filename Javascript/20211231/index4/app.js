const movies = [
    {title: 'Harry Potter', release: '2003-02-22'}, 
    {title: 'Indiana Jhones', release: '2009-01-09'}, 
    {title: 'Jurassic Park', release: '2007-04-13'},
    {title: 'Iron man', release: '2012-12-18'},
    {title: 'Spider man', release: '2017-03-07'}
]

function hasSomeWord(element){
    return element.release.split('-')[0] < 2010 && element.title.startsWith('J')
}

const found = movies.find(hasSomeWord)
console.log(found)